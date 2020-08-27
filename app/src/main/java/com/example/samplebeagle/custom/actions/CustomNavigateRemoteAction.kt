package com.example.samplebeagle.custom.actions

import br.com.zup.beagle.android.action.Action
import br.com.zup.beagle.android.action.Navigate
import br.com.zup.beagle.android.action.Route
import br.com.zup.beagle.android.context.Bind
import br.com.zup.beagle.android.utils.evaluateExpression
import br.com.zup.beagle.android.widget.RootView
import br.com.zup.beagle.annotation.RegisterAction

@RegisterAction
class CustomNavigateRemoteAction (val url: Bind<String>) : Action {

    override fun execute(rootView: RootView) {
        Navigate.PushStack(Route.Remote(url = evaluateExpression(rootView, url) ?: ""))
            .execute(rootView)
    }

}