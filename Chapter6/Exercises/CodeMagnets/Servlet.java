public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	HttpSession session = request.getSession();
	session.setMaxInactiveInterval(1200);
}
