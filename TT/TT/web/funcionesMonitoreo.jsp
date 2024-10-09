<%-- 
    Document   : funcionesMonitoreo
    Created on : 30/09/2024, 11:44:01 PM
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilosIndex.css" type="text/css" media="all">
        
        <title>JSP Page</title>
    </head>
    <body>
          <section id="monitoring">
      <div class="quality-status-row">
        <div class="quality-status">
          <div class="quality-circle good"></div>
          <span>Buena</span>
        </div>
        <div class="quality-status">
          <div class="quality-circle acceptable"></div>
          <span>Aceptable</span>
        </div>
        <div class="quality-status">
          <div class="quality-circle regular"></div>
          <span>Regular</span>
        </div>
        <div class="quality-status">
          <div class="quality-circle poor"></div>
          <span>Mala</span>
        </div>
      </div>


      <div class="container">
        <div class="column">
          <div class="donut-set">
            <div class="general-title">UPIITA</div>
            <div class="donut-container">
              <canvas id="ubicacion-sensores-1"></canvas>
              <div class="donut-label">Sensor 1</div>
            </div>
          </div>

          <div class="donut-set">
            <div class="general-title">Partículas</div>
            <div class="donut-container">
              <canvas id="pm1-1"></canvas>
              <div class="donut-label">PM1</div>
            </div>
            <div class="donut-container">
              <canvas id="pm25-1"></canvas>
              <div class="donut-label">PM2.5</div>
            </div>
            <div class="donut-container">
              <canvas id="pm10-1"></canvas>
              <div class="donut-label">PM10</div>
            </div>
          </div>
        </div>
        <div class="column">
          <div class="donut-set">
            <div class="general-title">ESCOM</div>
            <div class="donut-container">
              <canvas id="ubicacion-sensores-2"></canvas>
              <div class="donut-label">Sensor 2</div>
            </div>
          </div>
          <div class="donut-set">
            <div class="general-title">Partículas</div>
            <div class="donut-container">
              <canvas id="pm1-2"></canvas>
              <div class="donut-label">PM1</div>
            </div>
            <div class="donut-container">
              <canvas id="pm25-2"></canvas>
              <div class="donut-label">PM2.5</div>
            </div>
            <div class="donut-container">
              <canvas id="pm10-2"></canvas>
              <div class="donut-label">PM10</div>
            </div>
          </div>
        </div>

        <div class="column">
          <div class="donut-set">
            <div class="general-title">CDA</div>
            <div class="donut-container">
              <canvas id="ubicacion-sensores-3"></canvas>
              <div class="donut-label">Sensor 3</div>
            </div>
          </div>
          <div class="donut-set">
            <div class="general-title">Partículas</div>
            <div class="donut-container">
              <canvas id="pm1-3"></canvas>
              <div class="donut-label">PM1</div>
            </div>
            <div class="donut-container">
              <canvas id="pm25-3"></canvas>
              <div class="donut-label">PM2.5</div>
            </div>
            <div class="donut-container">
              <canvas id="pm10-3"></canvas>
              <div class="donut-label">PM10</div>
            </div>
          </div>
        </div>

      </div>
    </section>
    </body>
</html>
