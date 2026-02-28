package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderCloud: ImageVector
    get() {
        val current = _folderCloud
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FolderCloud",
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
                moveTo(x = 9.0f, y = 22.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -4.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -1.0f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.0f, dx2 = 1.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 1.5f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.0f, dx2 = 1.83f, dy2 = 0.44f, dx3 = 2.4f, dy3 = 1.2f)
                lineToRelative(dx = 1.5f, dy = 2.0f)
                curveTo(x1 = 12.78f, y1 = 5.7f, x2 = 13.0f, y2 = 6.0f, x3 = 14.0f, y3 = 6.0f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 4.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 1.0f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 2.0f)
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
                moveTo(x = 13.76f, y = 18.32f)
                curveToRelative(dx1 = -2.35f, dy1 = 0.17f, dx2 = -2.35f, dy2 = 3.57f, dx3 = 0.0f, dy3 = 3.74f)
                horizontalLineToRelative(dx = 5.56f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.82f, dy1 = -0.7f)
                curveToRelative(dx1 = 1.65f, dy1 = -1.44f, dx2 = 0.77f, dy2 = -4.32f, dx3 = -1.4f, dy3 = -4.59f)
                curveToRelative(dx1 = -0.78f, dy1 = -4.69f, dx2 = -7.56f, dy2 = -2.91f, dx3 = -5.96f, dy3 = 1.56f)
            }
        }.build().also { _folderCloud = it }
    }

@Suppress("ObjectPropertyName")
private var _folderCloud: ImageVector? = null
