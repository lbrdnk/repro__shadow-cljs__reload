(ns com.lbrdnk.shadow-reload-repro.nested-repro
  (:require ["react-native" :as rn]
            [reagent.core :as r]
            [shadow.expo :as expo]
            [com.lbrdnk.shadow-reload-repro.components.first-comp :refer [first-comp]]))

(defn root []
  [:> rn/View {:style {:flex 1 :justifyContent "center" :alignItems "center"}}
   [:> rn/Text "root"]
   [first-comp]])

(defn start
  {:dev/after-load true}
  []
  (expo/render-root (r/as-element [root])))

(defn init []
  (start))
