package info.nightscout.androidaps.plugins.iob.iobCobCalculator

import info.nightscout.androidaps.logging.AAPSLogger
import javax.inject.Inject
import javax.inject.Provider

class GlucoseStatusFactory @Inject constructor(
    private val aapsLogger: Provider<AAPSLogger>,
    private val iobCobCalculatorPlugin: Provider<IobCobCalculatorPlugin>
) {

    operator fun invoke() = GlucoseStatus(aapsLogger.get(), iobCobCalculatorPlugin.get())

}