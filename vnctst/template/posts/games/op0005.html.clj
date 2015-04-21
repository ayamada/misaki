; @layout  post
; @title   ドリームハイヤー
; @comment 公開
; @date 2014/07/19
; @nocache true

(def latest-version "0.1.0")

(defn heading-2 [title & [desc]]
  [:div
    (h2 {:id title} title)
   (if desc (p {:class "desc"} desc) "")
   ])


(p [:a {:href "http://ahoge.info/14/index.php#31"} "あほげー第14回"]
   "エントリー作品「ドリームハイヤー」紹介ページです。")
[:ul
 [:li "テーマは「寝る」。"]
 [:li "略称は「ドリハイ」。"]]
(p [:a {:href "jmzf.html"} "前回"] "に引き続き、"
   "24時間徹夜のテンションでがんばって作った。"
   )


(heading-2 "Play" "遊ぶ")
(p [:a {:href "/op0005/" :target "_blank"} "http://vnctst.tir.jp/op0005/"]
   "にて遊べます。")
[:ul [:li
      "プレイには"
      [:a {:href "http://japan.unity3d.com/webplayer/" :target "_blank"} "Unity Web Player"]
      "のインストールが必要です。"]]


(heading-2 "Staff" "製作者および利用素材など")
[:dl
 [:dt "ミドルウェア"]
 [:dd (link "Unity" "http://japan.unity3d.com/unity/")]
 [:dt "フォント"]
 [:dd (link "mp1mm16tir" "https://github.com/ayamada/mplus-1mn-medium-16-fnt-tir")]
 [:dt "ＢＧＭ"]
 [:dd
  (link "ニコニコ自作ゲームフェス用ニコ素材"
        "http://commons.nicovideo.jp/user/upload/659862?t=audio")]
 [:dt "利用させていただいた、他者作成の背景画像"]
 [:dd
  (link "きまぐれアフター" "http://www5d.biglobe.ne.jp/~gakai/")
  "様の"
  (link "学校_教室_窓側" "http://www5d.biglobe.ne.jp/~gakai/")
  [:br]
  "(下手な加工：技情研ネット 山田)"
  ]
 [:dt "利用させていただいた、他者作成のモンスター画像"]
 [:dd
  (link "とり夫" "http://www.pixiv.net/member.php?id=5887541")
  "様の"
  (link "エアジャイアント" "http://www.pixiv.net/member_illust.php?mode=medium&illust_id=33106619")]
 [:dt "利用させていただいた、他者作成の魚類画像"]
 [:dd
  (link "魚類" "http://www.pixiv.net/member.php?id=698269")
  "様の"
  (link "中段突き" "http://www.pixiv.net/member_illust.php?mode=medium&illust_id=43763623")]
 [:dt "利用させていただいた、他者作成のUnityPackage"]
 [:dd "Unity標準アセットのSkybox"]
 [:dd (link "Particle Cloud Package" "http://forum.unity3d.com/threads/particle-cloud-package.54833/") "の雲"]
 [:dd (link "UnitySkyboxShaders" "https://github.com/keijiro/UnitySkyboxShaders")]
 [:dt "企画、プログラミング、素材加工、残りグラフィック、効果音、その他いろいろ"]
 [:dd "技情研ネット 山田"]
 ]


(heading-2 "History" "更新履歴")
[:dl
 [:dt "2014/07/19 version 0.1.0 あほげー参加バージョン"]
 [:dd "公開"]
 [:dd "公式ページ設置"]
 ]



