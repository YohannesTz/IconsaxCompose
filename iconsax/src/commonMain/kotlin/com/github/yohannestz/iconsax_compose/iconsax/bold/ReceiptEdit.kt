package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 15.78f, y = 2.0f)
                horizontalLineTo(x = 8.22f)
                curveTo(x1 = 4.44f, y1 = 2.0f, x2 = 3.5f, y2 = 3.01f, x3 = 3.5f, y3 = 7.04f)
                verticalLineTo(y = 18.3f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.66f, dx2 = 1.46f, dy2 = 3.29f, dx3 = 3.23f, dy3 = 1.39f)
                lineToRelative(dx = 0.01f, dy = -0.01f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.78f, dy1 = 0.15f)
                lineToRelative(dx = 1.01f, dy = 1.35f)
                curveToRelative(dx1 = 0.81f, dy1 = 1.07f, dx2 = 2.12f, dy2 = 1.07f, dx3 = 2.93f, dy3 = 0.0f)
                lineToRelative(dx = 1.01f, dy = -1.35f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.79f, dy1 = -0.15f)
                curveToRelative(dx1 = 1.78f, dy1 = 1.9f, dx2 = 3.23f, dy2 = 1.27f, dx3 = 3.23f, dy3 = -1.39f)
                verticalLineTo(y = 7.04f)
                curveTo(x1 = 20.5f, y1 = 3.01f, x2 = 19.56f, y2 = 2.0f, x3 = 15.78f, y3 = 2.0f)
                moveToRelative(dx = -0.94f, dy = 7.99f)
                lineToRelative(dx = -0.5f, dy = 0.51f)
                horizontalLineToRelative(dx = -0.01f)
                lineToRelative(dx = -3.03f, dy = 3.03f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.59f, dy1 = 0.29f)
                lineToRelative(dx = -1.35f, dy = 0.2f)
                curveToRelative(dx1 = -0.49f, dy1 = 0.07f, dx2 = -0.83f, dy2 = -0.28f, dx3 = -0.76f, dy3 = -0.76f)
                lineToRelative(dx = 0.19f, dy = -1.36f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = -0.59f)
                lineToRelative(dx = 3.04f, dy = -3.03f)
                lineToRelative(dx = 0.5f, dy = -0.51f)
                curveToRelative(dx1 = 0.33f, dy1 = -0.33f, dx2 = 0.7f, dy2 = -0.57f, dx3 = 1.1f, dy3 = -0.57f)
                curveToRelative(dx1 = 0.34f, dy1 = 0.0f, dx2 = 0.71f, dy2 = 0.16f, dx3 = 1.12f, dy3 = 0.57f)
                curveToRelative(dx1 = 0.9f, dy1 = 0.9f, dx2 = 0.61f, dy2 = 1.61f, dx3 = 0.0f, dy3 = 2.22f)
            }
        }.build().also { _receiptEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptEdit: ImageVector? = null
