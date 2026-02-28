package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.43f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -2.32f, dx3 = -7.75f, dy3 = -7.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.43f, dx2 = 2.32f, dy2 = -7.75f, dx3 = 7.75f, dy3 = -7.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.43f, dy1 = 0.0f, dx2 = 7.75f, dy2 = 2.32f, dx3 = 7.75f, dy3 = 7.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.43f, dx2 = -2.32f, dy2 = 7.75f, dx3 = -7.75f, dy3 = 7.75f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveTo(x1 = 4.39f, y1 = 2.75f, x2 = 2.75f, y2 = 4.39f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.61f, dx2 = 1.64f, dy2 = 6.25f, dx3 = 6.25f, dy3 = 6.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.61f, dy1 = 0.0f, dx2 = 6.25f, dy2 = -1.64f, dx3 = 6.25f, dy3 = -6.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.61f, dx2 = -1.64f, dy2 = -6.25f, dx3 = -6.25f, dy3 = -6.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 18.63f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.46f, dy1 = -0.77f)
                lineToRelative(dx = -0.6f, dy = -0.8f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.24f, dy1 = -0.15f)
                quadToRelative(dx1 = -0.13f, dy1 = 0.0f, dx2 = -0.25f, dy2 = 0.12f)
                lineTo(x = 8.9f, y = 16.52f)
                lineToRelative(dx = 0.55f, dy = 0.51f)
                curveToRelative(dx1 = -0.97f, dy1 = 1.04f, dx2 = -1.76f, dy2 = 0.94f, dx3 = -2.15f, dy3 = 0.79f)
                curveToRelative(dx1 = -0.39f, dy1 = -0.16f, dx2 = -1.05f, dy2 = -0.64f, dx3 = -1.05f, dy3 = -2.12f)
                verticalLineTo(y = 9.07f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.78f, dx2 = 0.89f, dy2 = -3.71f, dx3 = 3.53f, dy3 = -3.71f)
                horizontalLineToRelative(dx = 4.45f)
                curveToRelative(dx1 = 2.64f, dy1 = 0.0f, dx2 = 3.53f, dy2 = 0.94f, dx3 = 3.53f, dy3 = 3.71f)
                verticalLineToRelative(dy = 6.63f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.48f, dx2 = -0.66f, dy2 = 1.97f, dx3 = -1.05f, dy3 = 2.12f)
                curveToRelative(dx1 = -0.38f, dy1 = 0.15f, dx2 = -1.17f, dy2 = 0.25f, dx3 = -2.15f, dy3 = -0.79f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.26f, dy1 = -0.12f)
                quadToRelative(dx1 = -0.14f, dy1 = 0.0f, dx2 = -0.24f, dy2 = 0.15f)
                lineToRelative(dx = -0.59f, dy = 0.79f)
                arcTo(horizontalEllipseRadius = 1.9f, verticalEllipseRadius = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 18.63f)
                moveToRelative(dx = -2.31f, dy = -3.22f)
                horizontalLineToRelative(dx = 0.09f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.35f, dy1 = 0.75f)
                lineToRelative(dx = 0.6f, dy = 0.8f)
                quadToRelative(dx1 = 0.27f, dy1 = 0.33f, dx2 = 0.52f, dy2 = 0.0f)
                lineToRelative(dx = 0.59f, dy = -0.79f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.36f, dy1 = -0.75f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.43f, dy1 = 0.6f)
                curveToRelative(dx1 = 0.28f, dy1 = 0.3f, dx2 = 0.46f, dy2 = 0.38f, dx3 = 0.53f, dy3 = 0.4f)
                curveToRelative(dx1 = -0.01f, dy1 = -0.05f, dx2 = 0.08f, dy2 = -0.25f, dx3 = 0.08f, dy3 = -0.71f)
                verticalLineTo(y = 9.08f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.05f, dx2 = -0.31f, dy2 = -2.21f, dx3 = -2.03f, dy3 = -2.21f)
                horizontalLineTo(x = 9.76f)
                curveToRelative(dx1 = -1.72f, dy1 = 0.0f, dx2 = -2.03f, dy2 = 0.16f, dx3 = -2.03f, dy3 = 2.21f)
                verticalLineToRelative(dy = 6.63f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.12f, dy1 = 0.72f)
                curveToRelative(dx1 = 0.03f, dy1 = -0.04f, dx2 = 0.21f, dy2 = -0.12f, dx3 = 0.48f, dy3 = -0.42f)
                lineToRelative(dx = 0.02f, dy = -0.02f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.34f, dy1 = -0.58f)
            }
        }.build().also { _receiptSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptSquare: ImageVector? = null
