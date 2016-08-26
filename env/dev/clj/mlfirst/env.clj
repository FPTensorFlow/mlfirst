(ns mlfirst.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [mlfirst.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[mlfirst started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[mlfirst has shut down successfully]=-"))
   :middleware wrap-dev})
