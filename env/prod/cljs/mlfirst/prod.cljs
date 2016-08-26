(ns mlfirst.app
  (:require [mlfirst.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
