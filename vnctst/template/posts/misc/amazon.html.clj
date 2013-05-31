; @layout  post
; @title   On the scrounge
; @comment ページ作成
; @date 2013/06/01
; @nocache true

(defn heading-2 [title & [id]]
  (let [id-true (or id title)]
    (h2 {:id id-true} title)))

(p {:class "desc"} "お願い")

(p "VNCTST gamesを運営している技情研ネット(というか山田)は現在、資金不足です。")
(p "もし「VNCTST gamesのゲーム/アプリが気に入った」"
   "「VNCTST gamesを支援したい」"
   "という方がいましたら、"
   "このページからamazonで買い物をしていただけると"
   "非常に助かります。")
(p "(もしAdblock類を使ってる場合、リンクが見えないかも知れません。"
   "その時はすみませんが一時的に解除をお願いします。)")

;; メモ:
;; - amazon.co.jp と javari.jp のトップへのリンク二つを表示する
;; - 携帯端末から見る事も考慮し、バナー画像の横幅は最大300までとする
;; - iframeはamazon側で勝手に内容を変更されるのが嫌なので避ける
;;   (「お得な中古商品はこちら！」とか勝手に変なターゲッティングされる)
;;   - しかしよく考えたら、 amazon.co.jp は確かにそうだが、
;;      javari.jp については既にターゲッティングされているので、
;;      iframeのものでよい、という事にする。
;;      - 要は、amazon.co.jpでの買い物は誰が何を買うか分からないので
;;        下手にターゲッティングしてほしくない。
;;        しかしjavari.jpでの買い物は女性系の人が靴やバッグを買うの確定で、
;;        既にある程度ターゲッティングされてるので、
;;        更にターゲッティングされても問題ない、という事

(heading-2 "amazon.co.jp")
[:div
 [:a {:href "http://www.amazon.co.jp/?_encoding=UTF8&camp=247&creative=1211&linkCode=ur2&tag=tirnejp-22"}
  [:img {:src "/img/amazon.gif"
         :width 300
         :height 50
         :border 0
         :alt "Amazon.co.jp 一般"}]]
 [:img {:src "http://www.assoc-amazon.jp/e/ir?t=tirnejp-22&l=ur2&o=9"
        :width 1
        :height 1
        :border 0
        :alt ""
        :style "border:none !important; margin:0px !important;"
        }]
 [:br]
 [:script {:charset "utf-8"
           :type "text/javascript"
           :src "http://ws.amazon.co.jp/widgets/q?rt=tf_sw&ServiceVersion=20070822&MarketPlace=JP&ID=V20070822/JP/tirnejp-22/8002/a689f5f6-9676-4615-ace3-46e193dd8c29"} " "]
 ]


(heading-2 "javari.jp")
[:div
 [:iframe {:src "http://rcm-jp.amazon.co.jp/e/cm?t=tirnejp-22&o=9&p=42&l=ur1&category=endless&m=endless&f=ifr"
           :width 234
           :height 60
           :scrolling "no"
           :border 0
           :marginwidth 0
           :style "border:none;"
           :frameborder 0
           }]
 ]


;; TODO: 自前でリスト化/ウィジェット化しないとどうにも使い勝手が悪い
(heading-2 "Recommended Items")
(p {:class "desc"} "VNCTST games おすすめの商品。山田が定期的に購入する物およびその他")
[:ul [:li
      [:a {:href "http://www.amazon.co.jp/%E5%AE%9A%E6%9C%9F%E8%B3%BC%E5%85%A5%E7%89%A9/lm/R2H9UILS0KPZ7C/?_encoding=UTF8&camp=247&creative=1211&linkCode=ur2&tag=tirnejp-22"}
       "定期購入物など"]
      [:img {:src "http://www.assoc-amazon.jp/e/ir?t=tirnejp-22&l=ur2&o=9"
             :width 1
             :height 1
             :border 0
             :alt ""
             :style "border:none !important; margin:0px !important;"
             }]
      ]]




