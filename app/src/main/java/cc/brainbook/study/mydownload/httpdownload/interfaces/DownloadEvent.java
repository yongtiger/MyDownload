package cc.brainbook.study.mydownload.httpdownload.interfaces;

import cc.brainbook.study.mydownload.httpdownload.bean.FileInfo;

/**
 * 下载事件接口
 */
public interface DownloadEvent {
    /**
     * 下载开始的事件
     *
     * @param fileInfo
     */
    void onStart(FileInfo fileInfo);

    /**
     * 下载停止的事件
     *
     * @param fileInfo
     */
    void onStop(FileInfo fileInfo);

    /**
     * 下载完成的事件
     *
     * @param fileInfo
     */
    void onComplete(FileInfo fileInfo);

}
