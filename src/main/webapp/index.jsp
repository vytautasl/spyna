<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Language" content="lt">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!--<meta name="Content-Type" content="text/html; charset=utf-8" />-->
    <title>Įmonės mėnesio planiniai rodikliai</title>
    <!-- import plugin script -->
    <script src='chart/Chart.min.js'></script>
    <script src='chart/Chart.StackedBar.js'></script>

</head>
<body>
<table>
    <tr>
        <td colspan="2" align="center">
            <h1>Įmonės mėnesio planiniai rodikliai</h1>
        </td>
    </tr>
    <tr>
        <td>
            <canvas id="canvas" height="450" width="600"></canvas>
        </td>
        <td>
            <canvas id="canvas1" height="450" width="600"></canvas>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <table width="450">
                <tr>
                    <td>
                        <div style="width: 50px;height: 50px;"></div>
                    </td>
                    <td>
                        <div style="width: 200px;height: 200px;"><canvas id="canvas2" height="100" width="100"></canvas></div>
                    </td>
                    <td>
                        <div style="width: 50px;height: 50px;"></div>
                    </td>
                    <td>
                        <div style="width: 200px;height:200px;"><canvas id="canvas3" height="100" width="100"></canvas></div>
                    </td>
                    <td>
                        <div style="width: 50px;height: 50px;"></div>
                    </td>
                    <td>
                        <div style="width: 200px;height:200px;"><canvas id="canvas4" height="100" width="100"></canvas></div>
                    </td>
                    <td>
                        <div style="width: 50px;height: 50px;"></div>
                    </td>
                    <td>
                        <div style="width: 200px;height:200px;"><canvas id="canvas5" height="100" width="100"></canvas></div>
                    </td>
                    <td>
                        <div style="width: 50px;height: 50px;"></div>
                    </td>
                    <td>
                        <div style="width: 200px;height:200px;"><canvas id="canvas6" height="100" width="100"></canvas></div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div style="width: 50px;height: 50px;"></div>
                    </td>
                    <td>
                        Apimčių augimo greitis
                    </td>
                    <td>
                        <div style="width: 50px;height: 50px;"></div>
                    </td>
                    <td>
                        Gedimino k. darbo greitis %
                    </td>
                    <td>
                        <div style="width: 50px;height: 50px;"></div>
                    </td>
                    <td>
                        Petro k. darbo greitis %
                    </td>
                    <td>
                        <div style="width: 50px;height: 50px;"></div>
                    </td>
                    <td>
                        Haas k. darbo greitis %
                    </td>
                    <td>
                        <div style="width: 50px;height: 50px;"></div>
                    </td>
                    <td>
                        CNC tek. k. darbo greitis %
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <table>
                <tr>
                    <td></td>
                    <td>Turimi užsakymai</td>
                    <td>Apimtys be pelno ir medž.</td>
                    <td>Realizacija</td>
                    <td>Gedimino k.</td>
                    <td>Petro k.</td>
                    <td>Haas k.</td>
                    <td>CNC tek. k.</td>
                </tr>
                <tr>
                    <td style="background-color: #46BFBD">Padaryta</td>
                    <td style="background-color: #46BFBD">1</td>
                    <td style="background-color: #46BFBD">2</td>
                    <td style="background-color: #46BFBD">3</td>
                    <td style="background-color: #46BFBD">4</td>
                    <td style="background-color: #46BFBD">5</td>
                    <td style="background-color: #46BFBD">6</td>
                    <td style="background-color: #46BFBD">7</td>
                </tr>
                <tr>
                    <td style="background-color: #F7464A">Dar liko</td>
                    <td style="background-color: #F7464A">1</td>
                    <td style="background-color: #F7464A">2</td>
                    <td style="background-color: #F7464A">3</td>
                    <td style="background-color: #F7464A">4</td>
                    <td style="background-color: #F7464A">5</td>
                    <td style="background-color: #F7464A">6</td>
                    <td style="background-color: #F7464A">7</td>
                </tr>
                <tr>
                    <td style="background-color: #00FF00">Norma</td>
                    <td style="background-color: #00FF00">1</td>
                    <td style="background-color: #00FF00">2</td>
                    <td style="background-color: #00FF00">3</td>
                    <td style="background-color: #00FF00">4</td>
                    <td style="background-color: #00FF00">5</td>
                    <td style="background-color: #00FF00">6</td>
                    <td style="background-color: #00FF00">7</td>
                </tr>
            </table>
        </td>
    </tr>
</table>

<script>
    var randomScalingFactor = function(){ return Math.round(Math.random()*100)};
    var randomColorFactor = function(){ return Math.round(Math.random()*255)};

    var barChartData = {
        labels : ["Turimi užsakymai","Apimtys be pelno ir medž.","Realizacija"],
        datasets : [
            {
                fillColor : "rgba(220,0,0,0.5)",
                strokeColor : "rgba(220,0,0,0.8)",
                highlightFill: "rgba(220,0,0,0.75)",
                highlightStroke: "rgba(220,0,0,1)",
                data : [randomScalingFactor(),randomScalingFactor(),randomScalingFactor()]
            },
            {
                fillColor : "rgba(151,187,205,0.5)",
                strokeColor : "rgba(151,187,205,0.8)",
                highlightFill : "rgba(151,187,205,0.75)",
                highlightStroke : "rgba(151,187,205,1)",
                data : [randomScalingFactor(),randomScalingFactor(),randomScalingFactor()]
            }
        ]
    };


    var barChartData1 = {
        labels : ["Gedimino k.","Petro k.","Haas k.","CNC tek. k."],
        datasets : [
            {
                fillColor : "rgba(220,0,0,0.5)",
                strokeColor : "rgba(220,0,0,0.8)",
                highlightFill: "rgba(220,0,0,0.75)",
                highlightStroke: "rgba(220,0,0,1)",
                data : [randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor()]
            },
            {
                fillColor : "rgba(151,187,205,0.5)",
                strokeColor : "rgba(151,187,205,0.8)",
                highlightFill : "rgba(151,187,205,0.75)",
                highlightStroke : "rgba(151,187,205,1)",
                data : [randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor()]
            }
        ]
    };

    var doughnutData1 = [
        {
            value: 300,
            color:"#F7464A",
            highlight: "#FF5A5E",
            label: "Red"
        },
        {
            value: 50,
            color: "#46BFBD",
            highlight: "#5AD3D1",
            label: "Green"
        }
    ]

    var doughnutData2 = [
        {
            value: 300,
            color:"#F7464A",
            highlight: "#FF5A5E",
            label: "Red"
        },
        {
            value: 50,
            color: "#46BFBD",
            highlight: "#5AD3D1",
            label: "Green"
        }
    ]

    var doughnutData3 = [
        {
            value: 300,
            color:"#F7464A",
            highlight: "#FF5A5E",
            label: "Red"
        },
        {
            value: 50,
            color: "#46BFBD",
            highlight: "#5AD3D1",
            label: "Green"
        }
    ]

    var doughnutData4 = [
        {
            value: 300,
            color:"#F7464A",
            highlight: "#FF5A5E",
            label: "Red"
        },
        {
            value: 50,
            color: "#46BFBD",
            highlight: "#5AD3D1",
            label: "Green"
        }
    ]

    var doughnutData5 = [
        {
            value: 300,
            color:"#F7464A",
            highlight: "#FF5A5E",
            label: "Red"
        },
        {
            value: 50,
            color: "#46BFBD",
            highlight: "#5AD3D1",
            label: "Green"
        }
    ]

    window.onload = function(){
        var ctx = document.getElementById("canvas").getContext("2d");
        window.myBar = new Chart(ctx).StackedBar(barChartData, {
            responsive : true
        });

        ctx = document.getElementById("canvas1").getContext("2d");
        window.myBar = new Chart(ctx).StackedBar(barChartData1, {
            responsive : true
        });

        ctx = document.getElementById("canvas2").getContext("2d");
        window.myBar = new Chart(ctx).Doughnut(doughnutData1, {
            responsive : true
        });

        ctx = document.getElementById("canvas3").getContext("2d");
        window.myBar = new Chart(ctx).Doughnut(doughnutData2, {
            responsive : true
        });

        ctx = document.getElementById("canvas4").getContext("2d");
        window.myBar = new Chart(ctx).Doughnut(doughnutData3, {
            responsive : true
        });

        ctx = document.getElementById("canvas5").getContext("2d");
        window.myBar = new Chart(ctx).Doughnut(doughnutData4, {
            responsive : true
        });

        ctx = document.getElementById("canvas6").getContext("2d");
        window.myBar = new Chart(ctx).Doughnut(doughnutData5, {
            responsive : true
        });
    };
</script>

</body>

</html>