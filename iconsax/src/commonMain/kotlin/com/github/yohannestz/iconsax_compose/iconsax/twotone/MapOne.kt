package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MapOne: ImageVector
    get() {
        val current = _mapOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MapOne",
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
                moveTo(x = 22.0f, y = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.5f, dx2 = -0.5f, dy2 = 4.25f, dx3 = -1.62f, dy3 = 5.38f)
                lineTo(x = 14.0f, y = 14.0f)
                lineToRelative(dx = 7.73f, dy = -7.73f)
                arcTo(horizontalEllipseRadius = 12.0f, verticalEllipseRadius = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 9.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.73f, y = 6.27f)
                lineTo(x = 6.27f, y = 21.73f)
                curveTo(x1 = 3.26f, y1 = 21.04f, x2 = 2.0f, y2 = 18.96f, x3 = 2.0f, y3 = 15.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = 2.0f, dy2 = -7.0f, dx3 = 7.0f, dy3 = -7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 3.96f, dy1 = 0.0f, dx2 = 6.04f, dy2 = 1.26f, dx3 = 6.73f, dy3 = 4.27f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.38f, y = 20.38f)
                curveTo(x1 = 19.25f, y1 = 21.5f, x2 = 17.5f, y2 = 22.0f, x3 = 15.0f, y3 = 22.0f)
                horizontalLineTo(x = 9.0f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.73f, dy1 = -0.27f)
                lineTo(x = 14.0f, y = 14.0f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.24f, y = 7.98f)
                curveToRelative(dx1 = 0.68f, dy1 = -2.93f, dx2 = 5.08f, dy2 = -2.93f, dx3 = 5.76f, dy3 = 0.0f)
                curveToRelative(dx1 = 0.39f, dy1 = 1.72f, dx2 = -0.69f, dy2 = 3.18f, dx3 = -1.64f, dy3 = 4.08f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.48f, dy1 = 0.0f)
                curveToRelative(dx1 = -0.95f, dy1 = -0.9f, dx2 = -2.04f, dy2 = -2.36f, dx3 = -1.64f, dy3 = -4.08f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 9.1f, y = 8.7f)
                close()
            }
        }.build().also { _mapOne = it }
    }

@Suppress("ObjectPropertyName")
private var _mapOne: ImageVector? = null
