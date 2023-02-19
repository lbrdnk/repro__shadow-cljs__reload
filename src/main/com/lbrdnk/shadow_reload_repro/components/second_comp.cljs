(ns com.lbrdnk.shadow-reload-repro.components.second-comp
  (:require ["react-native" :as rn]
            [com.lbrdnk.shadow-reload-repro.components.third-comp :refer [third-comp]]))

(defn second-comp [props]
  [:> rn/View {:style {:justifyContent "center" :alignItems "center"}}
   [:> rn/Text "second"]
   [third-comp]])