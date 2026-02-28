package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BitcoinCard: ImageVector
    get() {
        val current = _bitcoinCard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BitcoinCard",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 8.5f)
                horizontalLineToRelative(dx = 11.0f)
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
                moveTo(x = 6.0f, y = 16.5f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = 2.5f, dy = 0.0f)
                horizontalLineToRelative(dx = 4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 11.33f)
                verticalLineToRelative(dy = 4.78f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.51f, dx2 = -0.89f, dy2 = 4.39f, dx3 = -4.44f, dy3 = 4.39f)
                horizontalLineTo(x = 6.44f)
                curveTo(x1 = 2.89f, y1 = 20.5f, x2 = 2.0f, y2 = 19.62f, x3 = 2.0f, y3 = 16.11f)
                verticalLineTo(y = 7.89f)
                curveTo(x1 = 2.0f, y1 = 4.38f, x2 = 2.89f, y2 = 3.5f, x3 = 6.44f, y3 = 3.5f)
                horizontalLineToRelative(dx = 6.84f)
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
                moveTo(x = 17.0f, y = 3.25f)
                horizontalLineToRelative(dx = 3.13f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.25f, dy1 = 1.25f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.25f, dy1 = 1.25f)
                horizontalLineTo(x = 17.0f)
                close()
                moveToRelative(dx = 0.0f, dy = 2.5f)
                horizontalLineToRelative(dx = 3.57f)
                curveTo(x1 = 21.36f, y1 = 5.75f, x2 = 22.0f, y2 = 6.31f, x3 = 22.0f, y3 = 7.0f)
                reflectiveCurveToRelative(dx1 = -0.64f, dy1 = 1.25f, dx2 = -1.43f, dy2 = 1.25f)
                horizontalLineTo(x = 17.0f)
                close()
                moveToRelative(dx = 1.76f, dy = 2.5f)
                verticalLineTo(y = 9.5f)
                moveToRelative(dx = 0.0f, dy = -7.5f)
                verticalLineToRelative(dy = 1.25f)
                moveToRelative(dx = -0.57f, dy = 0.0f)
                horizontalLineTo(x = 16.0f)
                moveToRelative(dx = 2.19f, dy = 5.0f)
                horizontalLineTo(x = 16.0f)
            }
        }.build().also { _bitcoinCard = it }
    }

@Suppress("ObjectPropertyName")
private var _bitcoinCard: ImageVector? = null
