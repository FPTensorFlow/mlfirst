(ns mlfirst.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[mlfirst started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[mlfirst has shut down successfully]=-"))
   :middleware identity})
