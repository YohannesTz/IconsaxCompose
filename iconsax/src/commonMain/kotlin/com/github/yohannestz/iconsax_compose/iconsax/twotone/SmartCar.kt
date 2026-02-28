package com.github.yohannestz.iconsax_compose.iconsax.twotone

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
                moveTo(x = 12.14f, y = 7.62f)
                horizontalLineTo(x = 6.87f)
                curveTo(x1 = 5.0f, y1 = 7.62f, x2 = 4.59f, y2 = 8.55f, x3 = 4.36f, y3 = 9.7f)
                lineTo(x = 3.5f, y = 13.75f)
                horizontalLineToRelative(dx = 12.0f)
                lineTo(x = 14.66f, y = 9.7f)
                curveTo(x1 = 14.4f, y1 = 8.55f, x2 = 14.0f, y2 = 7.62f, x3 = 12.14f, y3 = 7.62f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.99f, y = 20.36f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.47f, y1 = 22.0f)
                horizontalLineToRelative(dx = -1.41f)
                curveToRelative(dx1 = -0.81f, dy1 = 0.0f, dx2 = -0.92f, dy2 = -0.35f, dx3 = -1.07f, dy3 = -0.77f)
                lineToRelative(dx = -0.15f, dy = -0.45f)
                curveToRelative(dx1 = -0.21f, dy1 = -0.6f, dx2 = -0.35f, dy2 = -1.03f, dx3 = -1.43f, dy3 = -1.03f)
                horizontalLineTo(x = 7.57f)
                curveToRelative(dx1 = -1.08f, dy1 = 0.0f, dx2 = -1.24f, dy2 = 0.47f, dx3 = -1.43f, dy3 = 1.03f)
                lineToRelative(dx = -0.15f, dy = 0.45f)
                curveTo(x1 = 5.85f, y1 = 21.66f, x2 = 5.74f, y2 = 22.0f, x3 = 4.92f, y3 = 22.0f)
                horizontalLineTo(x = 3.5f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.52f, dy1 = -1.64f)
                lineTo(x = 2.4f, y = 15.8f)
                curveToRelative(dx1 = 0.1f, dy1 = -1.13f, dx2 = 0.32f, dy2 = -2.05f, dx3 = 2.29f, dy3 = -2.05f)
                horizontalLineToRelative(dx = 9.57f)
                curveToRelative(dx1 = 1.97f, dy1 = 0.0f, dx2 = 2.18f, dy2 = 0.92f, dx3 = 2.29f, dy3 = 2.05f)
                close()
                moveTo(x = 3.5f, y = 11.5f)
                horizontalLineTo(x = 2.75f)
                moveToRelative(dx = 13.5f, dy = 0.0f)
                horizontalLineTo(x = 15.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.0f, y = 16.75f)
                horizontalLineToRelative(dx = 2.25f)
                moveToRelative(dx = 4.5f, dy = 0.0f)
                horizontalLineTo(x = 14.0f)
                moveToRelative(dx = 4.71f, dy = -8.01f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.34f, dy1 = -2.3f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = -1.19f)
                moveToRelative(dx = 5.45f, dy = 4.48f)
                arcToRelative(a = 6.1f, b = 6.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.95f, dy1 = -4.96f)
                arcTo(horizontalEllipseRadius = 6.1f, verticalEllipseRadius = 6.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.64f, y1 = 2.0f)
            }
        }.build().also { _smartCar = it }
    }

@Suppress("ObjectPropertyName")
private var _smartCar: ImageVector? = null
