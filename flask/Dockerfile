FROM python:3.10.6-alpine3.15
WORKDIR /app
COPY ./app.py /app
COPY ./requirements.txt /app
RUN pip install -r requirements.txt
EXPOSE 5000
CMD ["python","app.py"]