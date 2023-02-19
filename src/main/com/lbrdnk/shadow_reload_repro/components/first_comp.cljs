(ns com.lbrdnk.shadow-reload-repro.components.first-comp
  (:require ["react-native" :as rn]
            [com.lbrdnk.shadow-reload-repro.components.second-comp :refer [second-comp]]))

(defn first-comp [props]
  [:> rn/View {:style {:justifyContent "center" :alignItems "center"}}
   [:> rn/Text "first"]
   [second-comp]])