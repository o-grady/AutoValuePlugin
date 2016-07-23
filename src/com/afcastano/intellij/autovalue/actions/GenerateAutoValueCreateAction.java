package com.afcastano.intellij.autovalue.actions;

import com.afcastano.intellij.autovalue.generator.AutoValueHandler;
import com.intellij.codeInsight.generation.actions.BaseGenerateAction;

//TODO eventually remove the right click action.
public class GenerateAutoValueCreateAction extends BaseGenerateAction {

    public GenerateAutoValueCreateAction() {
        super(AutoValueHandler.newGenerateCreateMethodHandler());
    }

}
