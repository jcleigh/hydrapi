from flask import Flask

app = Flask(__name__)

@app.route('/hello')
def hello():
    return 'Hello, World!'

@app.route('/')
def index():
    return 'python/flask'

if __name__ == '__main__':
   app.run(debug = True)