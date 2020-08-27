package com.example.samplebeagle.beagle_settings

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem
import com.example.samplebeagle.R

@BeagleComponent
class AppDesignSystem : DesignSystem() {

    override fun textStyle(id: String): Int? {
        return when (id) {
            "Title.Text.Orange" -> R.style.Title_Text_Orange
            "Description.Text.Orange" -> R.style.Description_Text_Orange
            "Design.System.Text.ViewPager" -> R.style.Design_System_Text_ViewPager
            "Design.System.Title.ViewPager" -> R.style.Design_System_Title_ViewPager
            "TitleCardView" -> R.style.TitleCardView
            "TextCardView" -> R.style.TextCardView

            else -> R.style.Design_System_Text_Default
        }
    }

    override fun buttonStyle(id: String): Int? {
        return when (id) {
            "BaseFlatButton" -> R.style.BaseFlatButton

            else -> super.buttonStyle(id)
        }
    }

    override fun inputTextStyle(id: String): Int? {
        return when (id) {
            "InputRounded" -> R.style.InputRounded

            else -> super.inputTextStyle(id)
        }
    }

}