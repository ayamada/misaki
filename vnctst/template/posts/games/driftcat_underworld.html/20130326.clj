; @layout  post
; @title   ぶらり猫の旅　地底帝国編

(defn heading-2 [title & [id]]
  (let [id-true (or id title)]
    (h2 {:id id-true} title)))

(p "「ぶらり猫の旅　地底帝国編」は、猫を操作して地底帝国からの脱出を目指す、"
   "ぬるいRPGです。")
(p "想定プレイ時間は10分です。")
(p "ちょっと短いので、あとでマップを二つぐらい増やすかもしれません。")
(p "そのうち続編を作ります。")


(heading-2 "Movie")
(ul [(link "http://www.nicovideo.jp/watch/sm20447162")])


(heading-2 "Download")
[:dl
 [:dt "Android版"]
 [:dd (link "https://play.google.com/store/apps/details?id=jp.ne.tir.vnctst.android.underworld")]
 [:dt "Windows版(要Javaインストール)"]
 [:dd (link "https://dl.dropbox.com/u/9755436/dcuw/dcuw-1.1.1-windows.zip")]
 [:dt "Windows以外デスクトップOS版(要Javaインストール)"]
 [:dd (link "https://dl.dropbox.com/u/9755436/dcuw/dcuw-1.1.1-jar.zip")]
 ]


(heading-2 "History")
[:dl
 [:dt "2013/03/29 version 1.1.1"]
 [:dd "移動がおかしくなる問題を修正"]
 [:dt "2013/03/28 version 1.1.0"]
 [:dd "※セーブデータに互換性がなくなりました。最初からになります"]
 [:dd "敵のパラメータ変更、敵がrespawnするようになった"]
 [:dd "弱い敵はまとめて倒せるようにした"]
 [:dd "猫移動速度を微調整"]
 [:dd "一部の敵にメッセージ追加"]
 [:dd "歩行グラフィック微修正"]
 [:dd "敗北モーションとメッセージを追加"]
 [:dt "2013/03/27 version 1.0.1"]
 [:dd "BGMを追加"]
 [:dd "実行ファイル名を短くする"]
 [:dd "プロセスのタイトル名を日本語にする"]
 [:dd "exitボタンの見た目を修正"]
 [:dt "2013/03/27 version 1.0.0"]
 [:dd "公開"]
 [:dt "2013/03/26"]
 [:dd "公式ページ設置"]
 ]


(heading-2 "License")
[:ul [:li [:a {:href "driftcat_underworld_license.html"}
           "driftcat_underworld_license.html"]]]


