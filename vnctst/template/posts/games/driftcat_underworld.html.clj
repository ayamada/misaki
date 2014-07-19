; @layout  post
; @title   ぶらり猫の旅　地底帝国編
; @comment youtubeリンク追加
; @date 2013/04/27
; @nocache true

(defn heading-2 [title & [id]]
  (let [id-true (or id title)]
    (h2 {:id id-true} title)))

(p "「ぶらり猫の旅　地底帝国編」は、猫を操作して地底帝国からの脱出を目指す、"
   "ぬるいRPGです。")
(p "想定プレイ時間は10分もしくは30分です。")
(p "そのうち続編を作ります。")


(heading-2 "Movie")
(ul [[:span (link "http://www.youtube.com/watch?v=E3f7Sc5aVA0") " (youtube)"]
     [:span (link "http://www.nicovideo.jp/watch/sm20447162") " (ニコ動)"]
     ])


(heading-2 "Download")
[:dl
 [:dt "Android版"]
 [:dd [:a {:href "https://play.google.com/store/apps/details?id=jp.ne.tir.vnctst.android.underworld"}
       "https://play.google.com/store/apps/details?id=jp.ne.tir.vnctst.android.underworld"
       [:br]
       [:img {:alt "Get it on Google Play" :src "http://developer.android.com/images/brand/en_generic_rgb_wo_45.png"}]]]
 [:dt "Windows版(要Javaインストール)"]
 [:dd (link "https://dl.dropbox.com/u/9755436/dcuw/dcuw-1.2.2-windows.zip")]
 [:dt "Windows以外デスクトップOS版(要Javaインストール)"]
 [:dd (link "https://dl.dropbox.com/u/9755436/dcuw/dcuw-1.2.2-jar.zip")]
 [:dd
  "※現在Mac上では起動しないようです。"
  "そのうち時間のある時にビルドし直します。"]
 ]


(heading-2 "License")
[:ul [:li [:a {:href "driftcat_underworld_license.html"}
           "driftcat_underworld_license.html"]]]


(heading-2 "History")
[:dl
 [:dt "2013/04/27"]
 [:dd "youtube動画リンク追加"]
 [:dt "2013/04/03 version 1.2.2"]
 [:dd "※セーブデータに互換性がなくなりました。猫の強さ以外は最初からになります"]
 [:dd "ストーリーの追加、および、これに伴う一部メッセージの変更"]
 [:dd "一部の敵の強さ調整"]
 [:dd "猫ヒールの回復力を強化"]
 [:dd "アイコン画像微修正"]
 [:dt "2013/04/02 version 1.2.1"]
 [:dd "※タイトルで「そのた」を二回実行するとエラー終了する問題を修正"]
 [:dd "回復ポイントでの回復時に魔法効果を消去するようにした"]
 [:dd "魔法アイコンとイベントアイコンは同時に発動しないようにする"]
 [:dd "ダイアログ内ボタンの接触判定を大きくした"]
 [:dd "一部の敵パラメータ修正"]
 [:dt "2013/04/01 version 1.2.0"]
 [:dd "※セーブデータに互換性がなくなりました。猫の強さ以外は最初からになります"]
 [:dd "地下二階を実装"]
 [:dd "実績内容一部変更"]
 [:dd "一部イベントの内容変更"]
 [:dd "HP回復速度の大幅短縮"]
 [:dd "敵パラメータ調整"]
 [:dd "戦闘ロジック調整"]
 [:dd "グラフィック微修正"]
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



