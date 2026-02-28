package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReceiptEdit: ImageVector
    get() {
        val current = _receiptEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ReceiptEdit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 6.73f, y = 19.7f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.79f, dy1 = 0.15f)
                lineToRelative(dx = 1.0f, dy = 1.35f)
                curveToRelative(dx1 = 0.82f, dy1 = 1.07f, dx2 = 2.13f, dy2 = 1.07f, dx3 = 2.94f, dy3 = 0.0f)
                lineToRelative(dx = 1.0f, dy = -1.35f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.8f, dy1 = -0.15f)
                curveToRelative(dx1 = 1.78f, dy1 = 1.9f, dx2 = 3.23f, dy2 = 1.27f, dx3 = 3.23f, dy3 = -1.39f)
                verticalLineTo(y = 7.05f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.03f, dx2 = -0.94f, dy2 = -5.04f, dx3 = -4.72f, dy3 = -5.04f)
                horizontalLineTo(x = 8.2f)
                curveToRelative(dx1 = -3.78f, dy1 = 0.0f, dx2 = -4.72f, dy2 = 1.01f, dx3 = -4.72f, dy3 = 5.04f)
                verticalLineToRelative(dy = 11.26f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.66f, dx2 = 1.47f, dy2 = 3.28f, dx3 = 3.24f, dy3 = 1.4f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.84f, y = 9.99f)
                lineToRelative(dx = -0.5f, dy = 0.51f)
                horizontalLineToRelative(dx = -0.01f)
                lineToRelative(dx = -3.03f, dy = 3.03f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = 0.29f)
                lineToRelative(dx = -1.34f, dy = 0.2f)
                curveToRelative(dx1 = -0.5f, dy1 = 0.07f, dx2 = -0.83f, dy2 = -0.28f, dx3 = -0.76f, dy3 = -0.76f)
                lineToRelative(dx = 0.19f, dy = -1.36f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = -0.59f)
                lineToRelative(dx = 3.04f, dy = -3.03f)
                lineToRelative(dx = 0.5f, dy = -0.51f)
                curveToRelative(dx1 = 0.33f, dy1 = -0.33f, dx2 = 0.7f, dy2 = -0.57f, dx3 = 1.1f, dy3 = -0.57f)
                curveToRelative(dx1 = 0.34f, dy1 = 0.0f, dx2 = 0.7f, dy2 = 0.16f, dx3 = 1.12f, dy3 = 0.57f)
                curveToRelative(dx1 = 0.9f, dy1 = 0.9f, dx2 = 0.6f, dy2 = 1.61f, dx3 = 0.0f, dy3 = 2.22f)
            }
        }.build().also { _receiptEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptEdit: ImageVector? = null
