package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Rank: ImageVector
    get() {
        val current = _rank
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Rank",
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
                moveTo(x = 8.67f, y = 14.0f)
                horizontalLineTo(x = 4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = 2.0f)
                verticalLineToRelative(dy = 6.0f)
                horizontalLineToRelative(dx = 6.67f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.33f, y = 10.0f)
                horizontalLineToRelative(dx = -2.67f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = 2.0f)
                verticalLineToRelative(dy = 10.0f)
                horizontalLineToRelative(dx = 6.67f)
                verticalLineTo(y = 12.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = -2.0f)
                moveTo(x = 20.0f, y = 17.0f)
                horizontalLineToRelative(dx = -4.67f)
                verticalLineToRelative(dy = 5.0f)
                horizontalLineTo(x = 22.0f)
                verticalLineToRelative(dy = -3.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = -2.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.52f, y = 2.07f)
                lineToRelative(dx = 0.53f, dy = 1.06f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.42f, dy1 = 0.31f)
                lineToRelative(dx = 0.96f, dy = 0.16f)
                curveToRelative(dx1 = 0.61f, dy1 = 0.1f, dx2 = 0.76f, dy2 = 0.55f, dx3 = 0.32f, dy3 = 0.98f)
                lineTo(x = 14.0f, y = 5.33f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.16f, dy1 = 0.54f)
                lineToRelative(dx = 0.21f, dy = 0.92f)
                curveToRelative(dx1 = 0.17f, dy1 = 0.73f, dx2 = -0.22f, dy2 = 1.01f, dx3 = -0.86f, dy3 = 0.63f)
                lineToRelative(dx = -0.9f, dy = -0.53f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.59f, dy1 = 0.0f)
                lineToRelative(dx = -0.9f, dy = 0.53f)
                curveToRelative(dx1 = -0.64f, dy1 = 0.38f, dx2 = -1.03f, dy2 = 0.1f, dx3 = -0.86f, dy3 = -0.63f)
                lineToRelative(dx = 0.21f, dy = -0.92f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.16f, dy1 = -0.54f)
                lineTo(x = 9.25f, y = 4.59f)
                curveToRelative(dx1 = -0.44f, dy1 = -0.44f, dx2 = -0.3f, dy2 = -0.88f, dx3 = 0.32f, dy3 = -0.98f)
                lineToRelative(dx = 0.96f, dy = -0.16f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.42f, dy1 = -0.31f)
                lineToRelative(dx = 0.53f, dy = -1.06f)
                curveToRelative(dx1 = 0.29f, dy1 = -0.58f, dx2 = 0.75f, dy2 = -0.58f, dx3 = 1.04f, dy3 = -0.01f)
            }
        }.build().also { _rank = it }
    }

@Suppress("ObjectPropertyName")
private var _rank: ImageVector? = null
