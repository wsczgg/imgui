package imgui.example.android

import android.app.NativeActivity
import android.os.Bundle
import android.view.WindowManager

class MainActivity : NativeActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showSoftInput() // just show soft input, for testing
    }

    private fun showSoftInput() {
        // todo: if targetSdkVersion is 28 (android P) or later, this flag is ignored and the soft input does not show up!
        this.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
    }
}
