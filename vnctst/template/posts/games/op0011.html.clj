; @layout  post
; @title   おはぎ鉱山トンネル
; @comment version 0.1.2
; @date 2015/03/23
; @nocache true

(def latest-version "0.1.2")

(defn heading-2 [title & [desc]]
  [:div
    (h2 {:id title} title)
   (if desc (p {:class "desc"} desc) "")
   ])


(p [:a {:href "http://ahoge.info/16/index.php#21"} "あほげー第16回"]
   "エントリー作品「おはぎ鉱山トンネル」取扱説明書ページです。")

[:ul
 [:li "詳細はあとで書きます"]]


(heading-2 "Play" "遊ぶ")
[:ul [:li [:a {:href "/op0011/" :target "_blank"} "http://vnctst.tir.jp/op0011/"]]]


(heading-2 "Staff" "製作者および利用素材など")

(p "あとでかく")
;[:ul
; [:li "めんどいので大部分のリンクは省略してます。必要ならぐぐってください。"]]
;
;[:dl
; [:dt "ライブラリ類"]
; [:dd "ClojureScript"]
; [:dd "pixi.js"]
; [:dd "howler.js"]
; [:dt "フォント"]
; [:dd (link "M+ 1M bold" "http://mplus-fonts.sourceforge.jp/")]
; [:dt "ＢＧＭ"]
; [:dd
;  (link "ニコニコ自作ゲームフェス用ニコ素材"
;        "http://commons.nicovideo.jp/user/upload/659862?t=audio")]
; [:dt "企画、プログラミング、グラフィック、効果音、その他いろいろ"]
; [:dd "技情研ネット 山田"]
; ]


(heading-2 "History" "更新履歴")
[:dl
 [:dt "2015/03/22 version 0.1.2"]
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



