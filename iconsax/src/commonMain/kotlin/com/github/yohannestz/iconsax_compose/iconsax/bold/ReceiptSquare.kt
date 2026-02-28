package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.81f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveTo(x1 = 2.0f, y1 = 19.83f, x2 = 4.17f, y2 = 22.0f, x3 = 7.81f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
                moveTo(x = 17.0f, y = 15.71f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.57f, dx2 = -0.86f, dy2 = 1.94f, dx3 = -1.9f, dy3 = 0.82f)
                arcToRelative(a = 1.04f, b = 1.04f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.64f, dy1 = 0.09f)
                lineToRelative(dx = -0.59f, dy = 0.79f)
                curveToRelative(dx1 = -0.47f, dy1 = 0.63f, dx2 = -1.25f, dy2 = 0.63f, dx3 = -1.72f, dy3 = 0.0f)
                lineToRelative(dx = -0.6f, dy = -0.8f)
                arcToRelative(a = 1.04f, b = 1.04f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.64f, dy1 = -0.09f)
                curveTo(x1 = 7.86f, y1 = 17.64f, x2 = 7.0f, y2 = 17.27f, x3 = 7.0f, y3 = 15.71f)
                verticalLineTo(y = 9.08f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.37f, dx2 = 0.56f, dy2 = -2.96f, dx3 = 2.78f, dy3 = -2.96f)
                horizontalLineToRelative(dx = 4.44f)
                curveToRelative(dx1 = 2.22f, dy1 = 0.0f, dx2 = 2.78f, dy2 = 0.59f, dx3 = 2.78f, dy3 = 2.96f)
                close()
            }
        }.build().also { _receiptSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptSquare: ImageVector? = null
