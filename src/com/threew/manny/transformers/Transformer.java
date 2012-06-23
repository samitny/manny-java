package com.threew.manny.transformers;

public abstract class Transformer {
	public abstract <S, D> D convert(S source, D dest) throws Exception;
}
