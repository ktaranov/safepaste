(ns safepaste.home
  (:require [safepaste.css :as css]
            [hiccup.page :as page]))

(defn render [request]
  (page/html5
    [:head
     [:style (css/main)]
     (page/include-js "/main.js")
     [:title "safepaste"]]
    [:body
     [:div {:class "header"}
      [:nav
        [:a "post"]]]
     [:div {:class "input"}
      [:textarea#input {:placeholder "Enter your paste here…"}]]]))
