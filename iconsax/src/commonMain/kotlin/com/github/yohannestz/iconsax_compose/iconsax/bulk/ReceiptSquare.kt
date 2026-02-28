package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReceiptSquare: ImageVector
    get() {
        val current = _receiptSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ReceiptSquare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.9f, y = 16.53f)
                arcToRelative(a = 1.03f, b = 1.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.64f, dy1 = 0.09f)
                lineToRelative(dx = 0.6f, dy = 0.8f)
                curveToRelative(dx1 = 0.47f, dy1 = 0.63f, dx2 = 1.25f, dy2 = 0.63f, dx3 = 1.72f, dy3 = 0.0f)
                lineToRelative(dx = 0.59f, dy = -0.8f)
                arcToRelative(a = 1.04f, b = 1.04f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.64f, dy1 = -0.08f)
                curveToRelative(dx1 = 1.05f, dy1 = 1.12f, dx2 = 1.9f, dy2 = 0.75f, dx3 = 1.9f, dy3 = -0.82f)
                verticalLineTo(y = 9.09f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.37f, dx2 = -0.56f, dy2 = -2.96f, dx3 = -2.78f, dy3 = -2.96f)
                horizontalLineTo(x = 9.77f)
                curveToRelative(dx1 = -2.22f, dy1 = 0.0f, dx2 = -2.78f, dy2 = 0.59f, dx3 = -2.78f, dy3 = 2.96f)
                verticalLineToRelative(dy = 6.63f)
                curveToRelative(dx1 = 0.01f, dy1 = 1.55f, dx2 = 0.87f, dy2 = 1.92f, dx3 = 1.91f, dy3 = 0.8f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.82f)
                curveTo(x1 = 4.18f, y1 = 2.0f, x2 = 2.01f, y2 = 4.17f, x3 = 2.01f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = 2.17f, dy2 = 5.81f, dx3 = 5.81f, dy3 = 5.81f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
            }
        }.build().also { _receiptSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptSquare: ImageVector? = null
