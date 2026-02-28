package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BrifecaseCross: ImageVector
    get() {
        val current = _brifecaseCross
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BrifecaseCross",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.07f, y = 15.31f)
                lineToRelative(dx = -2.12f, dy = -2.11f)
                moveToRelative(dx = 2.1f, dy = 0.02f)
                lineToRelative(dx = -2.12f, dy = 2.12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 22.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 4.02f, dy1 = 0.0f, dx2 = 4.74f, dy2 = -1.61f, dx3 = 4.95f, dy3 = -3.57f)
                lineToRelative(dx = 0.75f, dy = -8.0f)
                curveTo(x1 = 21.97f, y1 = 7.99f, x2 = 21.27f, y2 = 6.0f, x3 = 17.0f, y3 = 6.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -4.27f, dy1 = 0.0f, dx2 = -4.97f, dy2 = 1.99f, dx3 = -4.7f, dy3 = 4.43f)
                lineToRelative(dx = 0.75f, dy = 8.0f)
                curveTo(x1 = 3.26f, y1 = 20.39f, x2 = 3.98f, y2 = 22.0f, x3 = 8.0f, y3 = 22.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 6.0f)
                verticalLineTo(y = 5.2f)
                curveTo(x1 = 8.0f, y1 = 3.43f, x2 = 8.0f, y2 = 2.0f, x3 = 11.2f, y3 = 2.0f)
                horizontalLineToRelative(dx = 1.6f)
                curveTo(x1 = 16.0f, y1 = 2.0f, x2 = 16.0f, y2 = 3.43f, x3 = 16.0f, y3 = 5.2f)
                verticalLineTo(y = 6.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 18.2f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -8.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 8.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.65f, y = 11.0f)
                arcTo(horizontalEllipseRadius = 16.0f, verticalEllipseRadius = 16.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 13.64f)
                moveTo(x = 2.6f, y = 11.27f)
                arcTo(horizontalEllipseRadius = 16.0f, verticalEllipseRadius = 16.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.0f, y1 = 13.68f)
            }
        }.build().also { _brifecaseCross = it }
    }

@Suppress("ObjectPropertyName")
private var _brifecaseCross: ImageVector? = null
