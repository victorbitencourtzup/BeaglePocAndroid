package com.example.samplebeagle.custom.widgets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.solver.widgets.WidgetContainer
import br.com.zup.beagle.android.components.form.InputWidget
import br.com.zup.beagle.android.widget.RootView
import br.com.zup.beagle.android.widget.WidgetView
import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget
import com.example.samplebeagle.R

@RegisterWidget
class CustomVaccineCarViewWidget(val urlImage: String, val name: String, val description: String ): WidgetView() {

    override fun buildView(rootView: RootView): View {

        var view = LayoutInflater.from(rootView.getContext()).inflate(R.layout.layout_custom_widget_vaccine_cardview, null)

        return view

    }

}