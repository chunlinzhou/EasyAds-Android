package com.easyads.supplier.ks;

import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsVideoPlayConfig;

/**
 * 快手SDK特殊配置管理
 */
public class EasyKSManager {
    private static EasyKSManager instance;

    private EasyKSManager() {
    }

    public static synchronized EasyKSManager getInstance() {
        if (instance == null) {
            instance = new EasyKSManager();
        }
        return instance;
    }


    private KsVideoPlayConfig defaultConfig = new KsVideoPlayConfig.Builder()
            .videoSoundEnable(true)
            .build();


    //激励视频播放配置
    public KsVideoPlayConfig rewardVideoConfig = null;
    //全屏视频播放配置
    public KsVideoPlayConfig fullScreenVideoConfig = null;
    //信息流视频播放配置
    public KsAdVideoPlayConfig nativeExpressConfig = null;
    //插屏视频播放配置
    public KsVideoPlayConfig interstitialVideoConfig = defaultConfig;
}
