package ingsw.pdd.adapter.creditapi.banky;

public class YBankCreditSender {

	public void sendCreditForValidate(final YBankCreditApprove request, final YBankCreditSenderListener listener) {

		new Thread(new Runnable() {
			// @Override eclipse
			public void run() {

				System.out.println(
						"YBank recibió la solicitud, en un momento y tendrá la respuesta, sea paciente por favor!");
				YBankCreditApproveResult response = new YBankCreditApproveResult();

				if (request.getCredit() <= 1500) {
					response.setApproved("Y");

				} else {
					response.setApproved("N");

				}
				try {

					Thread.sleep(1000 * 30);
				} catch (Exception e) {

					e.printStackTrace();
				}

				listener.notifyCreditResult(response);

			}
		}).start();

	}
}