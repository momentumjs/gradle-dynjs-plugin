package org.momentumjs.gradle.dynjs;

import org.dynjs.Config;
//import org.dynjs.exception.ThrowException;
import org.dynjs.runtime.*;

public class DynJsScriptRunner {
  
	private DynJS dynjs;
	private Config config;

	public DynJsScriptRunner() {
		config = new Config();
		dynjs  = new DynJS(config);
	}

	/*public Object runScript(String fileName) {
		Runner runner = dynjs.newRunner();
		return runner.withSource(new File(fileName)).execute();
	}*/
	
	public Object eval(String code) {
		return dynjs.evaluate(code);
	}

}