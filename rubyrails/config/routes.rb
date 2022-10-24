Rails.application.routes.draw do
  get '', to: 'application#root'
  get 'api', to: 'application#root'
  
  get 'hello', to: 'application#hello'
  get 'api/hello', to: 'application#hello'
end