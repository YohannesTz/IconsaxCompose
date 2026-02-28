package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GridEdit: ImageVector
    get() {
        val current = _gridEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GridEdit",
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
                moveTo(x = 22.0f, y = 11.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 1.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.03f, y = 8.5f)
                horizontalLineTo(x = 22.0f)
                moveToRelative(dx = -19.97f, dy = 7.0f)
                horizontalLineTo(x = 12.0f)
                moveToRelative(dx = -3.49f, dy = 6.49f)
                verticalLineTo(y = 2.0f)
                moveToRelative(dx = 7.0f, dy = 9.98f)
                verticalLineTo(y = 2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.73f, y = 14.67f)
                lineToRelative(dx = -4.15f, dy = 4.15f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.35f, dy1 = 0.7f)
                lineTo(x = 14.0f, y = 21.1f)
                curveToRelative(dx1 = -0.08f, dy1 = 0.57f, dx2 = 0.32f, dy2 = 0.98f, dx3 = 0.89f, dy3 = 0.9f)
                lineToRelative(dx = 1.59f, dy = -0.24f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.69f, dy1 = -0.35f)
                lineToRelative(dx = 4.15f, dy = -4.15f)
                curveToRelative(dx1 = 0.71f, dy1 = -0.7f, dx2 = 1.05f, dy2 = -1.55f, dx3 = 0.0f, dy3 = -2.6f)
                curveToRelative(dx1 = -1.04f, dy1 = -1.04f, dx2 = -1.87f, dy2 = -0.7f, dx3 = -2.59f, dy3 = 0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.14f, y = 15.26f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.6f, dy1 = 2.6f)
            }
        }.build().also { _gridEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _gridEdit: ImageVector? = null
