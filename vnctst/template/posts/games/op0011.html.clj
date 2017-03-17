; @layout  post
; @title   おはぎ鉱山トンネル
; @comment version 0.2.1
; @date 2015/04/20
; @nocache true

(def latest-version "0.2.1")
(def latest-version-date "2015/04/20")

(defn heading-2 [title & [desc]]
  [:div
    (h2 {:id title} title)
   (if desc (p {:class "desc"} desc) "")
   ])

(defn a-href-external [url & [label]]
  [:a {:href url, :target "_blank" :rel "noopener noreferrer"} (or label url)])









(p {:class "desc"} "version: " latest-version " (" latest-version-date ")")

(p (a-href-external "http://ahoge.info/" "あほげー第16回")
   "エントリー作品「おはぎ鉱山トンネル」取扱説明書ページです。")

[:ul [:li "略称は「おは鉱」。"]]


(heading-2 "Play" "遊ぶ")
[:ul [:li (a-href-external "/op0011/" "http://vnctst.tir.jp/op0011/")]]


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
 [:dt "名前辞書"]
 [:dd (a-href-external "http://sourceforge.jp/projects/naist-jdic/"
                       "naist-jdic") "より加工して利用"]
 [:dt "企画、プログラミング、グラフィック、効果音、その他いろいろ"]
 [:dd "技情研ネット 山田"]
 ]


(heading-2 "History" "更新履歴")
[:dl
 [:dt "2015/04/20 version 0.2.1"]
 [:dd [:ul [:li "chromeでBGMがループしない問題を修正"]]]
 [:dt "2015/03/28 version 0.2.0"]
 [:dd
  [:ul
   [:li "イベントとギミックを多数追加"]
   [:li "ゲームバランス調整"]
   [:li "ステータスウィンドウの改善"]
   [:li "前進、ダメージ等の演出を強化"]
   [:li "その他、軽微な修正多数"]
   ]]
 [:dt "2015/03/23 version 0.1.2"]
 [:dd [:ul [:li "極稀にセーブデータのロードに失敗する問題を修正"]]]
 [:dt "2015/03/22 version 0.1.1"]
 [:dd
  [:ul
   [:li "セーブデータのリセット機能を追加"]
   [:li "レベルアップに必要な経験値を少し軽減"]
   [:li "スタミナゲージを実装"]
   [:li "一部の情報表示を強化"]
   [:li "クリアしていなくてもtweetボタンを表示"]
   [:li "tweet時の文章の内容の調整"]
   [:li "その他、細かい調整"]]]
 [:dt "2015/03/21 version 0.1.0 あほげー登録バージョン"]
 [:dd [:ul [:li "公開"]]]
 ]



