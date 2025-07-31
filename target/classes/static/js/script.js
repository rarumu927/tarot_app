document.getElementById("drawButton").addEventListener("click", function () {
  
   const container = document.getElementById("result");

  // ローディング表示（占い中）
  container.innerHTML = "<p>占い結果を取得中...</p>";
  
  fetch("http://localhost:8080/tarot")
    .then(response => response.json())
    .then(data => {
      const container = document.getElementById("result");
      container.innerHTML = `
        <h2>${data.name}</h2>
        <p><strong>正位置の意味：</strong> ${data.meaningUpright}</p>
        <p><strong>逆位置の意味：</strong> ${data.meaningReversed}</p>
        <p><strong>今回の位置：</strong> ${data.position === "reversed" ? "逆位置" : "正位置"}</p>
        <img src="${data.imageUrl}" alt="${data.name}" width="200" height="auto"  class ="${data.position === 'reversed' ? 'rotated' : ''}" />
        <p><strong>説明：</strong> ${data.description}</p>
      `;
    })
    .catch(error => {
      console.error("エラー:", error);
      document.getElementById("result").textContent = "占い結果を取得できませんでした。";
    });
});