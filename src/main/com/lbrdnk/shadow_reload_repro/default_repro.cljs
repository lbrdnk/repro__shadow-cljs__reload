(ns com.lbrdnk.shadow-reload-repro.default-repro
  (:require ["react-native" :as rn]
            [reagent.core :as r]
            [shadow.expo :as expo]
            ["/com/lbrdnk/shadow_reload_repro/components/AnotherComponent" :refer [AnotherComponent]]
            ["/com/lbrdnk/shadow_reload_repro/components/SomeComponent$default" :as SomeComponent]))

(defn root []
  [:> rn/View {:style {:flex 1 :justifyContent "center" :alignItems "center"}}
   [:> SomeComponent]
   [:> AnotherComponent]])

(defn start
  {:dev/after-load true}
  []
  (expo/render-root (r/as-element [root])))

(defn init []
  (start))
