package com.maizuo.seat.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.codehaus.xfire.client.Client;
import org.codehaus.xfire.transport.http.CommonsHttpMessageSender;

public class UrlRequestUtils {
	public static final Logger LOG = Logger.getLogger(UrlRequestUtils.class);
	private static final String RCE = "Remote Connection error";

	public class Mode {
		public final static String POST = "POST";
		public final static String GET = "GET";
	};

	@SuppressWarnings("rawtypes")
	public static String execute(String url, Map<String, String> paraMap, String mode) {
		// 请求者
		HttpUriRequest request = null;
		// 应答者
		HttpResponse response = null;
		// 配置对象
		// BasicHttpContext context = new BasicHttpContext();
		if (Mode.POST.equals(mode)) {// POST 请求
			request = new HttpPost(url);
			if (!paraMap.isEmpty()) {// 参数不为空
				List<NameValuePair> nvps = new ArrayList<NameValuePair>();
				Set<String> key = paraMap.keySet();
				// 遍历
				for (Iterator it = key.iterator(); it.hasNext();) {
					String s = (String) it.next();
					nvps.add(new BasicNameValuePair(s, paraMap.get(s)));
				}
				try {
					((HttpPost) request).setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
		} else {// GET 请求
			url = buildURL(url, paraMap);
			request = new HttpGet(url);
		}
		// 发送请求
		response = getHttpResponse(request);
		if (response == null || response.getStatusLine().getStatusCode() != 200) {// 通讯失败
			// 终止连接
			request.abort();
			return null;
		}
		try {
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				return EntityUtils.toString(entity, "utf-8");
			} else {
				return null;
			}
		} catch (UnsupportedEncodingException e) {
			request.abort();
			LOG.error(e.getMessage(), e);
		} catch (IllegalStateException e) {
			request.abort();
			LOG.error(e.getMessage(), e);
		} catch (IOException e) {
			request.abort();
			LOG.error(e.getMessage(), e);
		} finally {
			request.abort();
		}
		return null;
	}

	public static String executeHttpByString(String url, String info) {
		// 请求者
		HttpPost httpPost = null;
		// 应答者
		HttpResponse response = null;
		try {
			httpPost = new HttpPost(url);
			StringEntity stringentity = new StringEntity(info, "UTF-8");
			httpPost.addHeader("Host", "passport_i.25pp.com");
			httpPost.setEntity(stringentity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 发送请求
		response = getHttpResponse(httpPost);
		if (response == null || response.getStatusLine().getStatusCode() != 200) {// 通讯失败
			// 终止连接
			httpPost.abort();
			return null;
		}
		try {
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				return EntityUtils.toString(entity, "utf-8");
			} else {
				return null;
			}
		} catch (UnsupportedEncodingException e) {
			httpPost.abort();
			LOG.error(e.getMessage(), e);
		} catch (IllegalStateException e) {
			httpPost.abort();
			LOG.error(e.getMessage(), e);
		} catch (IOException e) {
			httpPost.abort();
			LOG.error(e.getMessage(), e);
		} finally {
			httpPost.abort();
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public static String buildURL(String url, Map paramMap) {
		if (paramMap == null || paramMap.isEmpty()) {
			return url;
		}
		if (StringUtils.isBlank(url)) {
			return url;
		}
		StringBuffer sb = new StringBuffer();
		for (Iterator iterator = paramMap.keySet().iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			sb.append(key).append("=").append(paramMap.get(key));
			if (iterator.hasNext()) {
				sb.append("&");
			}
		}
		String paraStr = sb.toString();
		sb.setLength(0);
		StringBuffer buffer = new StringBuffer();

		buffer.append(url);
		if (url.indexOf("?") != -1) {
			if (url.indexOf("?") == url.length() - 1) {
				buffer.append(paraStr);
			} else {
				buffer.append("&").append(paraStr);
			}
		} else {
			buffer.append("?").append(paraStr);
		}
		return buffer.toString();
	}

	/**
	 * 获取响应对象
	 * 
	 * @param request
	 *            请求对象
	 * @param context
	 *            配置参数
	 * @return
	 */
	public static HttpResponse getHttpResponse(HttpUriRequest request) {
		try {
			// return
			// HttpConnectionPoolManager.getHttpClient().execute(request);
			HttpClient httpClient = new DefaultHttpClient();
			return httpClient.execute(request);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			request.abort();
			LOG.error("网络连接异常或者客户端协议错误:" + request.getURI());
			LOG.error(e.getMessage(), e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			request.abort();
			LOG.info("网络连接异常:" + request.getURI());
			LOG.error(e.getMessage(), e);
		}
		return null;
	}

	public static String xfireCall(String urlStr, String method, LinkedHashMap<String, Object> map) {

		HttpURLConnection httpConnection = null;
		String reStr = RCE;

		for (int count = 0; count < 3; count++) {
			try {
				URL url = new URL(urlStr);
				Object[] data = new Object[map.size()];
				int i = 0;
				for (Object o : map.values()) {
					data[i] = o;
					i++;
				}
				httpConnection = (HttpURLConnection) url.openConnection();
				httpConnection.setConnectTimeout(10000);
				httpConnection.connect();
				Client client = new Client(httpConnection.getInputStream(), null);
				HttpClientParams clientParams = new HttpClientParams();
				clientParams.setSoTimeout(1000 * 20);// 超过20秒如果服务器还没返回结果,就超时抛异常
				clientParams.setParameter(HttpClientParams.CONNECTION_MANAGER_TIMEOUT, (long) 10000);// 单位是毫秒
				client.setProperty(CommonsHttpMessageSender.HTTP_CLIENT_PARAMS, clientParams);

				Object[] results = client.invoke(method, data);
				httpConnection.disconnect();
				reStr = (String) results[0];
				break;
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			} finally {
				if (httpConnection != null) {
					httpConnection.disconnect();
				}
			}
		}
		return reStr;
	}

}
