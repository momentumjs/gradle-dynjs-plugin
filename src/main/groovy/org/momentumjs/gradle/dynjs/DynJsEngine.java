package org.momentumjs.gradle.dynjs;

import org.gradle.api.Incubating;
import org.momentumjs.gradle.jsengine.JsEngineDescriptor;
import org.momentumjs.gradle.jsengine.plugins.AbstractJsEngine;

@Incubating
public class DynJsEngine extends AbstractJsEngine {

    public DynJsEngine() {
        super(new JsEngineDescriptor("DynJS", "0.2.1", "5"));
    }
}