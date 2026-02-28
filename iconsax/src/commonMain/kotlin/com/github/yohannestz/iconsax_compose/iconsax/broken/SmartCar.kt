package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SmartCar: ImageVector
    get() {
        val current = _smartCar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SmartCar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.4f, y = 7.62f)
                horizontalLineTo(x = 6.86f)
                curveToRelative(dx1 = -1.86f, dy1 = 0.0f, dx2 = -2.28f, dy2 = 0.93f, dx3 = -2.5f, dy3 = 2.08f)
                lineTo(x = 3.5f, y = 13.75f)
                horizontalLineToRelative(dx = 12.0f)
                lineTo(x = 14.66f, y = 9.7f)
                curveToRelative(dx1 = -0.24f, dy1 = -1.14f, dx2 = -0.65f, dy2 = -2.08f, dx3 = -2.5f, dy3 = -2.08f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.89f, y = 19.2f)
                lineTo(x = 17.0f, y = 20.35f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.48f, y1 = 22.0f)
                horizontalLineToRelative(dx = -1.41f)
                curveToRelative(dx1 = -0.81f, dy1 = 0.0f, dx2 = -0.92f, dy2 = -0.35f, dx3 = -1.07f, dy3 = -0.77f)
                lineToRelative(dx = -0.15f, dy = -0.45f)
                curveToRelative(dx1 = -0.21f, dy1 = -0.6f, dx2 = -0.35f, dy2 = -1.03f, dx3 = -1.43f, dy3 = -1.03f)
                horizontalLineTo(x = 7.58f)
                curveToRelative(dx1 = -1.08f, dy1 = 0.0f, dx2 = -1.24f, dy2 = 0.47f, dx3 = -1.43f, dy3 = 1.03f)
                lineTo(x = 6.0f, y = 21.23f)
                curveTo(x1 = 5.86f, y1 = 21.66f, x2 = 5.75f, y2 = 22.0f, x3 = 4.93f, y3 = 22.0f)
                horizontalLineTo(x = 3.52f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 20.36f)
                lineToRelative(dx = 0.42f, dy = -4.57f)
                curveToRelative(dx1 = 0.11f, dy1 = -1.13f, dx2 = 0.32f, dy2 = -2.05f, dx3 = 2.29f, dy3 = -2.05f)
                horizontalLineToRelative(dx = 9.57f)
                curveToRelative(dx1 = 1.97f, dy1 = 0.0f, dx2 = 2.18f, dy2 = 0.92f, dx3 = 2.29f, dy3 = 2.05f)
                moveTo(x = 3.5f, y = 11.5f)
                horizontalLineTo(x = 2.75f)
                moveToRelative(dx = 13.5f, dy = 0.0f)
                horizontalLineTo(x = 15.5f)
                moveTo(x = 5.0f, y = 16.75f)
                horizontalLineToRelative(dx = 2.25f)
                moveToRelative(dx = 4.5f, dy = 0.0f)
                horizontalLineTo(x = 14.0f)
                moveToRelative(dx = 4.71f, dy = -8.01f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.34f, dy1 = -2.3f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = -1.19f)
                moveToRelative(dx = 2.01f, dy = -2.71f)
                arcTo(horizontalEllipseRadius = 6.0f, verticalEllipseRadius = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.64f, y1 = 2.0f)
                moveToRelative(dx = 5.18f, dy = 7.73f)
                arcToRelative(a = 6.1f, b = 6.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.95f, dy1 = -4.96f)
            }
        }.build().also { _smartCar = it }
    }

@Suppress("ObjectPropertyName")
private var _smartCar: ImageVector? = null
