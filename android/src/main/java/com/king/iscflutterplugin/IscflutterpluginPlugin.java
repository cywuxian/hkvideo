package com.king.iscflutterplugin;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/**
 * IscflutterpluginPlugin
 */
public class IscflutterpluginPlugin implements FlutterPlugin {
//    /** Plugin registration. */
//  public static void registerWith(Registrar registrar) {
//    final MethodChannel channel = new MethodChannel(registrar.messenger(), "iscflutterplugin");
//    channel.setMethodCallHandler(new IscflutterpluginPlugin());
//  }
//
//  @Override
//  public void onMethodCall(MethodCall call, Result result) {
//    if (call.method.equals("getPlatformVersion")) {
//      result.success("Android " + android.os.Build.VERSION.RELEASE);
//    } else {
//      result.notImplemented();
//    }
//  }

    /**
     * 新版插件加载
     *
     * @param flutterPluginBinding
     */
    @Override
    public void onAttachedToEngine(FlutterPluginBinding flutterPluginBinding) {
        //播放器注册
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("plugin:isc_player", new IscPlayerViewFactory(flutterPluginBinding.getBinaryMessenger()));
    }

    @Override
    public void onDetachedFromEngine(FlutterPluginBinding binding) {
    }

    /**
     * 旧版插件加载
     *
     * @param registrar
     */
    public static void registerWith(Registrar registrar) {
        //播放器注册
        registrar.platformViewRegistry().registerViewFactory("plugin:isc_player", new IscPlayerViewFactory(registrar.messenger()));
    }
}
