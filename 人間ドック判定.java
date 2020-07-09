package csv;

public enum 人間ドック判定 implements 健診判定{
	A("A", "異常なし"),
	B("B", "軽度異常"),
	C("C", "要経過観察"),
	D("D", "要治療"),
	E("E", "治療中");

	protected final String judgmentResult;
	private final String message;

	private 人間ドック判定(final String judgmentResult, final String message) {
		this.judgmentResult = judgmentResult;
		this.message = message;
	}

	@Override
	public void setLenient(boolean lenient) {
		return;
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

