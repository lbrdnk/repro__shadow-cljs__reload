(ns com.lbrdnk.shadow-reload-repro.components.third-comp
  (:require ["react-native" :as rn]))

(defn third-comp [props]
  [:> rn/View {:style {:justifyContent "center" :alignItems "center"}}
   [:> rn/Text "third"]])