package com.maizuo.seat.state.error;

public enum FirePhenixError implements Error {
	锁定失败(3) {
		@Override
		public String getComment() {
			return SeatError.该座位已被锁定.getComment();
		}
	},
	排期已過期(8002) {
		@Override
		public String getComment() {
			return SeatError.该座位已被锁定.getComment();
		}
	},
	锁定座位排期错误(6) {
		@Override
		public String getComment() {
			return SeatError.该座位已被锁定.getComment();
		}
	},
	调用过程发生异常(100500) {
		@Override
		public String getComment() {
			return null;
		}
	},
	网线掉落(21) {
		@Override
		public String getComment() {
			return null;
		}
	},
	参数校验信息错误(100101) {
		@Override
		public String getComment() {
			return null;
		}
	},

	XML参数解释错误(100102) {
		@Override
		public String getComment() {
			return null;
		}
	},
	地面连接数量已满或不存在此地面链接(100103) {
		@Override
		public String getComment() {
			return null;
		}
	},
	应用无权限(100104) {
		@Override
		public String getComment() {
			return null;
		}
	},
	令牌失效(100105) {
		@Override
		public String getComment() {
			return null;
		}
	},
	中心解锁失败(101209) {
		@Override
		public String getComment() {
			return null;
		}
	},
	;
	private int code;

	private FirePhenixError(int code) {
		this.code = code;
	}

	public static FirePhenixError getErrorByCode(int code) {
		for (FirePhenixError m : values()) {
			if (m.code == code) {
				return m;
			}
		}
		return null;
	}

	@Override
	public abstract String getComment();

	public String value() {
		return this.toString();
	}
}
