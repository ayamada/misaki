; @layout post
; @nocache true
; @title スーパーマーケマンサー
; @version 0.2.2
; @comment version 0.2.2
; @date 2015/04/19

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
  [:a {:href url, :target "_blank"} (or label url)])









(p {:class "desc"} "version: " (:version site) " (" (site->date site) ")")

(p (a-href-external "http://ahoge.info/1000/index.php#41" "超あほげー")
   "エントリー作品「スーパーマーケマンサー」取扱説明書ページです。")

;[:ul
; [:li "詳細はあとで書きます"]]


(heading-2 "Play" "遊ぶ")
[:ul [:li (a-href-external "http://vnctst.tir.jp/op0012/")]]


(heading-2 "Staff" "製作者および利用素材など")

[:dl
 [:dt "ライブラリ類"]
 [:dd (a-href-external "https://github.com/clojure/clojurescript" "ClojureScript")]
 [:dd (a-href-external "http://www.pixijs.com/" "pixi.js")]
 [:dd (a-href-external "http://goldfirestudios.com/blog/104/howler.js-Modern-Web-Audio-Javascript-Library" "howler.js")]
 [:dd (a-href-external "http://pieroxy.net/blog/pages/lz-string/index.html" "lz-string")]
 [:dd (a-href-external "http://labs.cybozu.co.jp/blog/mitsunari/2007/07/md5js_1.html" "md5.js")]
 [:dt "フォント"]
 [:dd (a-href-external "http://mplus-fonts.sourceforge.jp/" "M+ 1M bold")]
 [:dt "ＢＧＭ"]
 [:dd (a-href-external "http://commons.nicovideo.jp/user/upload/659862?t=audio"
                       "ニコニコ自作ゲームフェス用ニコ素材")]
 ;[:dt "辞書データ"]
 ;[:dd (a-href-external "http://www.dsri.jp/company/jicfsifdb/top.htm"
 ;                      "JICFS分類コード一覧")]
 [:dt "企画、プログラミング、グラフィック、効果音、その他いろいろ"]
 [:dd "技情研ネット 山田"]
 ]


(heading-2 "History" "更新履歴")
[:dl
 [:dt "2015/04/19 version 0.2.2"]
 [:dd [:ul [:li "稀にNaN円の商品が出てしまう問題を修正"]]]
 [:dt "2015/04/19 version 0.2.1"]
 [:dd [:ul
       [:li "ChromeでBGMがループしない不具合が全然直ってなかったので、きちんと修正"]
       [:li "セーブ機能を撤廃"]
       [:li "MP等のステータスを表示"]
       [:li "リザルト画面およびツイート機能を追加"]
       ]]
 [:dt "2015/04/18 version 0.1.1"]
 [:dd [:ul [:li "ChromeでBGMがループしない不具合を修正"]]]
 [:dt "2015/04/18 version 0.1.0 超あほげー登録バージョン"]
 [:dd [:ul [:li "公開"]]]
 ]



