; @layout post
; @nocache true
; @title スーパーマーケマンサー
; @version 0.4.1
; @comment version 0.4.1
; @date 2015/04/24

(defn site->date [site]
  (let [dtf (org.joda.time.format.DateTimeFormat/forPattern "yyyy/MM/dd")]
    (.print dtf (:date site))))

(defn heading-2 [title & [desc]]
  [:div
    (h2 {:id title} title)
   (if desc (p {:class "desc"} desc) "")
   ])

(defn a-href [url & [label]]
  [:a {:href url} (or label url)])

(defn a-href-external [url & [label]]
  [:a {:href url, :target "_blank" :rel "noopener noreferrer"} (or label url)])









(p {:class "desc"} "version: " (:version site) " (" (site->date site) ")")

(p (a-href-external "http://ahoge.info/chou/" "超あほげー")
   "エントリー作品「スーパーマーケマンサー」取扱説明書ページです。")

[:ul
 [:li "略称は「スママ」。"]
 [:li
  "まともに遊べる続編ができました。"
  "→"
  "『"
  (a-href "op0012-3.html" "キャプテンスーパーマーケマンサー")
  "』"
  ]]


(heading-2 "Play" "遊ぶ")
[:ul [:li (a-href-external "http://vnctst.tir.jp/op0012/")]]


(heading-2 "Staff" "製作者および利用素材など")

[:dl
 [:dt "ライブラリ類"]
 [:dd (a-href-external "https://github.com/clojure/clojurescript" "ClojureScript")]
 [:dd (a-href-external "http://www.pixijs.com/" "pixi.js")]
 [:dd (a-href-external "https://github.com/CyberAgent/boombox.js" "boombox.js")]
 [:dd (a-href-external "http://pieroxy.net/blog/pages/lz-string/index.html" "lz-string")]
 [:dd (a-href-external "http://labs.cybozu.co.jp/blog/mitsunari/2007/07/md5js_1.html" "md5.js")]
 [:dt "フォント"]
 [:dd (a-href-external "http://mplus-fonts.sourceforge.jp/" "M+ 1M bold")]
 [:dt "ＢＧＭ"]
 [:dd (a-href-external "http://commons.nicovideo.jp/user/upload/659862?t=audio"
                       "ニコニコ自作ゲームフェス用ニコ素材")]
 [:dt "辞書データ"]
 [:dd (a-href-external "http://www.dsri.jp/company/jicfsifdb/top.htm"
                       "JICFS分類コード一覧") "を参考に作成"]
 [:dt "企画、プログラミング、グラフィック、効果音、その他いろいろ"]
 [:dd "技情研ネット 山田"]
 ]


(heading-2 "History" "更新履歴")
[:dl
 [:dt "2015/04/24 version 0.4.1"]
 [:dd [:ul [:li "firefoxでたまに効果音が途切れる事がある不具合を修正"]]]
 [:dt "2015/04/24 version 0.4.0"]
 [:dd [:ul
       [:li "ダイアログ回りの不具合を修正"]
       [:li "商品の価格表記を実際のスーパーに合わせて外税表記にする"]
       [:li "商品の価格設定をよりそれらしく改善"]
       [:li "リザルト画面での表示情報を少し追加"]
       ]]
 [:dt "2015/04/23 version 0.3.0"]
 [:dd [:ul [:li "音回りの不具合を修正"]]]
 [:dt "2015/04/22 version 0.2.5"]
 [:dd [:ul
       [:li "Android, iOSで動かなかった不具合を修正"]
       [:li "各種のモバイル向けの微調整"]
       ]]
 [:dt "2015/04/21 version 0.2.4"]
 [:dd [:ul
       [:li "ゲーム画面のブラウザ内最大化機能を追加"]
       [:li "商品辞書を少し調整"]
       [:li "ツイートメッセージを少しだけ変更"]
       ]]
 [:dt "2015/04/21 version 0.2.3"]
 [:dd [:ul
       [:li "稀にNaN円の商品が出てしまう問題が全然直ってなかったので、きちんと修正"]
       [:li "よく見たら召喚エフェクトがボタンよりも手前に表示されていたのを、ボタンの方が手前になるように修正"]
       [:li "回線が遅いとたまにフォントのロードに失敗する問題を修正"]
       ]]
 [:dt "2015/04/19 version 0.2.2"]
 [:dd [:ul [:li "稀にNaN円の商品が出てしまう問題を修正"]]]
 [:dt "2015/04/19 version 0.2.1"]
 [:dd [:ul
       [:li "chromeでBGMがループしない不具合が全然直ってなかったので、きちんと修正"]
       [:li "セーブ機能を撤廃"]
       [:li "MP等のステータスを表示"]
       [:li "リザルト画面およびツイート機能を追加"]
       ]]
 [:dt "2015/04/18 version 0.1.1"]
 [:dd [:ul [:li "chromeでBGMがループしない不具合を修正"]]]
 [:dt "2015/04/18 version 0.1.0 超あほげー登録バージョン"]
 [:dd [:ul [:li "公開"]]]
 ]



