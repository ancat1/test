package csv;

public enum 健診機関統一判定 implements 健診判定{
	A("A", "異常なし"),
	B("B", "軽度異常"),
	C("C", "要経過観察"),
	D("D", "要治療"),
	D1("D1", "要治療"){
		@Override
		public String getJudgmentResult() {
			return this.lenient ? this.judgmentResult : D.judgmentResult;
		}
	},
	D2("D2", "受精検"){
		@Override
		public String getJudgmentResult() {
			return this.lenient ? this.judgmentResult : D.judgmentResult;
		}
	},
	E("E", "治療中");

	private final String message;
	protected final String judgmentResult;
	protected boolean lenient = true;

	private 健診機関統一判定(final String judgmentResult, final String message) {
		this.judgmentResult = judgmentResult;
		this.message = message;
	}

	/**
	 * @return true：D1、D2どちらもDとする。false：D1、D2をそのまま扱う。
	 */
	public boolean isLenient() {
		return lenient;
	}

	/**
	 * @param lenient true：D1、D2どちらもDとする。false：D1、D2をそのまま扱う。
	 */
	@Override
	public void setLenient(boolean lenient) {
		this.lenient = lenient;
	}

	/**
	 * @return String：AからEの判定
	 */
	@Override
	public String getJudgmentResult() {
		return this.judgmentResult;
	}

	/**
	 * @return String：AからEの判定 + 判定の意味
	 */
	@Override
	public String getJudgmentResultAndMessage() {
		return getJudgmentResult() + this.message;
	}
}

