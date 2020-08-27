package com.example.samplebeagle.custom.validators

import br.com.zup.beagle.android.annotation.RegisterValidator
import br.com.zup.beagle.android.components.form.core.Validator
import br.com.zup.beagle.core.ServerDrivenComponent

@RegisterValidator("TextNotEmptyValidator")
class TextNotEmptyValidator : Validator<String, ServerDrivenComponent> {
    override fun isValid(input: String, widget: ServerDrivenComponent): Boolean {
        return input.isNullOrEmpty().not()
    }
}